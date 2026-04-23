import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @PostMapping("/analyze")
    public PasswordResponse analyze(@RequestBody PasswordRequest request) {

        String password = request.getPassword();

        int score = PasswordAnalyzer.calculateScore(password);
        String strength = PasswordAnalyzer.getStrength(score);
        String hash = HashUtil.hashPassword(password);

        return new PasswordResponse(score, strength, hash);
    }
}
