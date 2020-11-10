package me.escoffier.mutiny.fight;

import io.smallrye.mutiny.Uni;
import me.escoffier.mutiny.fight.model.Hero;
import me.escoffier.mutiny.fight.model.Villain;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "supes-service")
@Produces(MediaType.APPLICATION_JSON)
public interface SupesServiceClient {

    @GET
    @Path("/hero")
    Uni<Hero> getRandomHero();

    @GET
    @Path("/villain")
    Uni<Villain> getRandomVillain();

}
