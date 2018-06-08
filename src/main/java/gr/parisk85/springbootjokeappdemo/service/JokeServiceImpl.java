package gr.parisk85.springbootjokeappdemo.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
