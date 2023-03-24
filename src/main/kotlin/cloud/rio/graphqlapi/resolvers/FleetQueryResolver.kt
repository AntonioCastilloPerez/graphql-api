package cloud.rio.graphqlapi.resolvers
import cloud.rio.graphqlapi.domain.Fleet
import cloud.rio.graphqlapi.repository.FleetRepository
import org.springframework.stereotype.Controller
import org.springframework.graphql.data.method.annotation.QueryMapping


@Controller
class FleetQueryResolver(
    private val fleetRepository: FleetRepository
) {

    @QueryMapping
    fun fleets(): List<Fleet> {
        return fleetRepository.getAllFleets()
    }
}
