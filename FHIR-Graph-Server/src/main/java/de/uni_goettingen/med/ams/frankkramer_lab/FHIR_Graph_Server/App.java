package de.uni_goettingen.med.ams.frankkramer_lab.FHIR_Graph_Server;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
//     Using the Custom Structure
//        
//     // Create a context. Note that we declare the custom types we'll be using
//     // on the context before actually using them
//     FhirContext ctx = FhirContext.forDstu3();
//     ctx.registerCustomType(CustomResource.class);
//     ctx.registerCustomType(CustomDatatype.class);
//      
//     // Now let's create an instance of our custom resource type
//     // and populate it with some data
//     CustomResource res = new CustomResource();
//      
//     // Add some values, including our custom datatype
//     DateType value0 = new DateType("2015-01-01");
//     res.getTelevision().add(value0);
//      
//     CustomDatatype value1 = new CustomDatatype();
//     value1.setDate(new DateTimeType(new Date()));
//     value1.setKittens(new StringType("FOO"));
//     res.getTelevision().add(value1);
//      
//     res.setDogs(new StringType("Some Dogs"));
//      
//     // Now let's serialize our instance
//     String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(res);
//     System.out.println(output);
    }
}
