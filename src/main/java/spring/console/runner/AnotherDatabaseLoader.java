package spring.console.runner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.console.runner.domain.Image;
import spring.console.runner.service.ImageService;

@Component
@Order(value=1)
public class AnotherDatabaseLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(AnotherDatabaseLoader.class);

    private ImageService imageService;

    public AnotherDatabaseLoader(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("AnotherDatabaseLoader is loading ... 4,5,6");

        imageService.save(new Image("Image 4", "Title 4"));
        imageService.save(new Image("Image 5", "Title 5"));
        imageService.save(new Image("Image 6", "Title 6"));

    }
}
