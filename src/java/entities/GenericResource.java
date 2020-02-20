/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author s_jashan
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;
    
    String plainText = null;
    String html = null;
    String xml = null;
    String json = null;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of foo.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() 
    {
        plainText = "Plain text response from RESTful web service!";
        return plainText;
    }
    
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String getHTML() 
    {
        html = "<html> " + 
                        "<title>" + 
                            "Hello SOEN487" + 
                        "</title>" +
                        "<body><h1>" + 
                            "HTML response from RESTful web service!" + 
                        "</body></h1>" + 
                      "</html> ";
        return html;
    }
    
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String getXML() 
    {
        xml = "<?xml version=\"1.0\"?>" +
                        "<response>" + 
                            "XML response from RESTful web service!" +
                        "</response>";
        return xml;
    }
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJSON() 
    {
        json = "{" +
                "\"id\" : 1," +
                "\"name\" : \"SOEN487\"" +
                "}";
        return json;
    }
}
