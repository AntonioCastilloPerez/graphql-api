package cloud.rio.graphqlapi.resolvers

import cloud.rio.graphqlapi.repository.FleetRepository
import org.springframework.graphql.data.method.annotation.SubscriptionMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux
import java.time.Duration
import java.util.*

@Controller
class SubscriptionResolver(
    private val fleetRepository: FleetRepository
) {
    @SubscriptionMapping("numberFleets")
    fun numberFleets(): Flux<Int>? {
        // A flux is the publisher of data
        return Flux.interval(Duration.ofSeconds(1))
            .map { fleetRepository.getAllFleets().size }
    }
}
