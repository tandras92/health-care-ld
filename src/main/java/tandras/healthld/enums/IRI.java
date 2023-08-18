package tandras.healthld.enums;

public enum IRI {

    HL7_IRI("http://hl7.org/fhir/"),
    OWL_IRI("http://www.w3.org/2002/07/owl#"),
    XSD_IRI("http://www.w3.org/2001/XMLSchema#"),
    RDFS_IRI("http://www.w3.org/2000/01/rdf-schema#"),
    FHIR_VS_IRI("http://hl7.org/fhir/ValueSet/"),
    CS_IRI("http://hl7.org/orim/codesystem/"),
    DT_IRI("http://hl7.org/orim/datatype/"),
    EX_IRI("http://hl7.org/fhir/StructureDefinition/"),
    RDF_IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#"),
    RIM_IRI("http://hl7.org/owl/rim/"),
    DC_TERMS_IRI("http://purl.org/dc/terms/"),
    VS_IRI("http://hl7.org/orim/valueset/"),
    W5_IRI("http://hl7.org/fhir/w5#"),
    LOINC_IRI("http://loinc.org/rdf#"),
    DC_IRI("http://purl.org/dc/elements/1.1/");


    private final String iri;

    IRI(String iri) {
        this.iri = iri;
    }
}
