package cloud.rio.graphqlapi.resolvers

import cloud.rio.graphqlapi.domain.Fleet
import cloud.rio.graphqlapi.repository.FleetRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.stereotype.Controller

@Controller
class FleetMutationResolver(
    private val fleetRepository: FleetRepository
) {
    @MutationMapping
    fun saveFleet(@Argument fleet: Fleet): Fleet {
        return fleetRepository.save(fleet)
    }
}
