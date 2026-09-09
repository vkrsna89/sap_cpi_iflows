import com.sap.gateway.ip.core.customdev.util.Message
import java.util.Map

Message processData(Message message) {
    
    // 1. Define allowed headers required by downstream external API
    def allowedHeaders = [
        'Content-Type',
        'Authorization',
        'Accept',
        'SOAPAction'
    ] as Set

    // 2. Extract current headers from Camel Message
    Map<String, Object> headers = message.getHeaders()
    
    // 3. Identify custom internal headers that must be purged
    List<String> headersToRemove = []
    
    headers.each { key, value ->
        // Keep standard system headers (starting with Camel/SAP) and explicit allowed list
        if (!allowedHeaders.contains(key) && !key.startsWith("Camel") && !key.startsWith("SAP_")) {
            headersToRemove.add(key)
        }
    }

    // 4. Safely remove non-essential headers from the exchange
    headersToRemove.each { headerName ->
        message.removeHeader(headerName)
    }

    // 5. Optional: Audit logging property (Internal scope only)
    message.setProperty("PurgedHeaderCount", headersToRemove.size())

    return message
}
