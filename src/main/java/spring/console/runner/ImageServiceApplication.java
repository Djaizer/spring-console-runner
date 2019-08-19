package spring.console.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.console.runner.domain.Image;
import spring.console.runner.service.ImageService;

@SpringBootApplication
public class ImageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ImageService imageService) {
        return args -> {
            imageService.save(new Image("Image 7", "Title 7"));
            imageService.save(new Image("Image 8", "Title 8"));
            imageService.save(new Image("Image 9", "Title 97"));
        };
    }

}

