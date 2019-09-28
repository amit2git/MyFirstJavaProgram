import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import sun.awt.windows.WPrintDialog;
import sun.awt.windows.WSystemTrayPeer;


@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class Hello {

	public static void main(String[] args) {

		Hello h = new Hello();
		h.print();
			}

	@Bean
    public void Print() {
		System.out.println("Hello World!");
    }
}
