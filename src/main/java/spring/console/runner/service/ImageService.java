package spring.console.runner.service;


import org.springframework.stereotype.Service;
import spring.console.runner.domain.Image;
import spring.console.runner.repository.ImageRepository;

@Service
public class ImageService {

    private ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public void save(Image image) {
        imageRepository.save(image);
    }
}
