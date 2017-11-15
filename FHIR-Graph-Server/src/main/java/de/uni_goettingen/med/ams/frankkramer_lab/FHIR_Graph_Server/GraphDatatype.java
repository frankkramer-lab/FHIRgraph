package de.uni_goettingen.med.ams.frankkramer_lab.FHIR_Graph_Server;

import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.instance.model.api.ICompositeType;
 
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.util.ElementUtil;
 
/**
 * This is an implementation of a custom graph datatype.
 *
 * This is an STU3 datatype so it extends Type and implements ICompositeType. For
 * DSTU2 it would extend BaseIdentifiableElement and implement ICompositeDatatype.
 */
@DatatypeDef(name="GraphDatatype")
public class GraphDatatype extends Type implements ICompositeType {
 
    private static final long serialVersionUID = 1L;
     
    @Child(name = "date", order = 0, min = 1, max = 1)
    private DateTimeType myDate;
 
    @Child(name = "kittens", order = 1, min = 1, max = 1)
    private StringType myKittens;
 
    
    
    
    public DateTimeType getDate() {
        if (myDate == null)
            myDate = new DateTimeType();
        return myDate;
    }
 
    public StringType getKittens() {
        return myKittens;
    }
 
    @Override
    public boolean isEmpty() {
        return ElementUtil.isEmpty(myDate, myKittens);
    }
 
    public GraphDatatype setDate(DateTimeType theValue) {
        myDate = theValue;
        return this;
    }
 
    public GraphDatatype setKittens(StringType theKittens) {
        myKittens = theKittens;
        return this;
    }
 
    @Override
    protected GraphDatatype typedCopy() {
        GraphDatatype retVal = new GraphDatatype();
        super.copyValues(retVal);
        retVal.myDate = myDate;
        return retVal;
    }
}
