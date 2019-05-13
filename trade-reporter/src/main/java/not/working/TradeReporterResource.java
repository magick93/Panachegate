package not.working;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Path("/trades")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class TradeReporterResource {

    //@Inject
    //TradeReporterService reporter;

    @POST
    //@Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response add( Trade trade) {
        Trade t = new Trade();
        System.out.println("setting close price");
        //t.closePrice = trade.closePrice;
        System.out.println("persisting");
        trade.persist();
        System.out.println("persisted");
        return Response.ok(trade).build();
    }
}