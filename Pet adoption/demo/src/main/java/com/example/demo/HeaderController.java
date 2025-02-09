package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/header")
    public String getHeader() {
        return """
                    <header>
                        <nav>
                            <div class="logo"> PetAdopt
                                <img src="logo_paw.png" alt="Logo" style="height: 30px; margin-left: 10px; border-radius: 50%; object-fit: cover;">
                            </div>
                            <ul class="nav-links">
                                <li><a href="index.html">Home</a></li>
                                <li><a href="Adopt.html">Adopt</a></li>
                                <li><a href="contact.html">Contact</a></li>
                                <li><a href="AboutUs.html">About Us</a></li>
                                <li><a href="map.html">Map</a></li>
                            </ul>
                        </nav>
                    </header>
                """;
    }
}
