package cloud.rio.graphqlapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlApiApplication

fun main(args: Array<String>) {
	runApplication<GraphqlApiApplication>(*args)
}
