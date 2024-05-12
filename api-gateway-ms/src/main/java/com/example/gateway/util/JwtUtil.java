package com.example.gateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {


    public static final String SECRET = "eyJ1c2VyIjoibXlhcHBsaWNhdGlvbiIsIm5hbWUiOiJKb2huIERvZSIsImlhdCI6MTUxNjIzOTAyMn0";


    public void validateToken(final String token) {
        Jwts.parser().verifyWith(key()).build().parse(token);
    }



    public SecretKey key(){
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET));
    }

}