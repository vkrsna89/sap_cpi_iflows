# SAP CPI Integration Flows & Patterns (`sap_cpi_iflows`)

A curated repository of SAP Cloud Integration (SAP CPI / SAP Integration Suite) Integration Flows (iFlows), custom Groovy scripts, and reusable enterprise integration patterns. 

This repository serves as a reference implementation library for modern cloud integration challenges, handling complex payload transformations, advanced routing, error handling, and connectivity setups on the SAP Business Technology Platform (SAP BTP).

---

## 📂 Repository Structure

```text
sap_cpi_iflows/
├── iflows/                   # Exported SAP CPI Integration Flow packages
│   ├── content-modifier/     # Examples utilizing Content Modifiers and headers/properties
│   ├── routers-splitters/    # Multicast, Router, and Splitter/Aggregator patterns
│   └── exception-handling/   # Try-Catch, Error EndEvents, and fault sub-processes
├── scripts/                  # Reusable Groovy scripts and custom mapping functions
│   ├── groovy/
│   │   ├── PayloadEnhancer.groovy
│   │   └── ExceptionExtractor.groovy
│   └── javascript/
└── docs/                     # Architecture diagrams, payload samples, and documentation


Key Integration Patterns Included
1. Advanced Message Routing & Splitting
Content-Based Routing: Dynamic message routing using XPath and Camel Simple expressions.

Splitter & Aggregator: Batch processing large payload payloads into individual messages and re-assembling responses.

2. Payload Transformation & Enrichment
Groovy Scripting: Custom script steps for dynamic header/property manipulation, JSON-to-XML conversion logic, and payload sanitization.

Content Modifiers: Property management, header injection, and correlation ID generation.

3. Robust Error Handling
Exception Sub-processes: Centralized error-catching patterns with detailed payload logging and custom alert propagation.

🛠️ Prerequisites & Setup
To import and test these iFlow packages in your SAP Integration Suite tenant:

SAP BTP Tenant: Access to an SAP Integration Suite / Cloud Integration tenant with developer permissions.

Integration Designer: Familiarity with the Web UI artifact designer.

Transport / Import:

Download the desired iFlow archive (.zip) from the iflows/ directory.

Navigate to Design > Integrations and APIs in your tenant.

Click Import and select the downloaded zip file.
