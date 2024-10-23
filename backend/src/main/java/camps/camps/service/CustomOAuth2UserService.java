package camps.camps.service;

import camps.camps.model.StudentDetails;
import camps.camps.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) {
        OAuth2User oAuth2User = super.loadUser(userRequest);

        // Extract email from OAuth2 provider
        String email = oAuth2User.getAttribute("email");

        // Check if a student with the email exists, else create a new entry
        StudentDetails student = studentDetailsRepository.findByEmail(email);
        if (student == null) {
            student = new StudentDetails();
            student.setName(oAuth2User.getAttribute("name"));
            student.setEmail(email); // Assuming StudentDetails has an email field
            studentDetailsRepository.save(student);
        }

        // Return the OAuth2 user with default authorities and email as principal
        return new DefaultOAuth2User(
                Collections.emptyList(),
                oAuth2User.getAttributes(),
                "email"
        );
    }
}
