package pl.patrykpora.qgame.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@AutoConfigureMockMvc
@WebMvcTest
class HealthConditionOFAppCheckerControllerTest extends Specification {

    @Autowired
    private MockMvc mvc

    def "when get is performed response status is 200"() {
        expect: "status is 200"
        mvc.perform(MockMvcRequestBuilders.get("/api/healthCondition"))
                .andReturn()
                .response
                .status == 200
    }
}
