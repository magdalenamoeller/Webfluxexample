package awin;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Controller
public class MyEsController {

    private final String elasticsearchServiceUrl = "http://localhost:9200";
    private final String clusterHealthPath = "/_cluster/health?wait_for_status=green";//&timeout=3s";

    @GetMapping("/status")
    @ResponseBody
    public ClusterHealth handler() {
        return getExample().block();
    }


    private Mono<ClusterHealth> getExample() {
        WebClient client = WebClient.create(elasticsearchServiceUrl);

        Mono<ClusterHealth> result = client.get()
                .uri(clusterHealthPath).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ClusterHealth.class);


        return result;
    }
}
