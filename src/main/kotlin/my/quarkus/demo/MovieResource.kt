package my.quarkus.demo

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/movies")
class MovieResource {
    val movies: List<String> = mutableListOf("1st movie", "2nd movie")

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun getMovies(): Response {
        return Response.ok(movies).build()
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/size")
    fun movieCount(): Int{
        return movies.size
    }

}
