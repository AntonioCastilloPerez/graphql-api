package cloud.rio.graphqlapi.repository

import cloud.rio.graphqlapi.domain.Fleet
import org.springframework.stereotype.Repository

@Repository
class FleetRepository {
    val fleets = mutableListOf<Fleet>()

    fun save(fleet: Fleet): Fleet {
        fleets.add(fleet)
        return fleet
    }

    fun getAllFleets(): List<Fleet> {
        return fleets
    }

}
