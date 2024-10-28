package Prac1;

//import java.math.*;
import java.util.*;

public class Prac1_1 {
    
    static String[] quotes = {"The only person you are destined to become is the person you decide to be. — Ralph Waldo Emerson",
        "As we work to create light for others, we naturally light our own way. — Mary Anne Radmacher",
        "To live is the rarest thing in the world. Most people exist, that is all. — Oscar Wilde",
        "Keep your face to the sunshine and you cannot see a shadow. — Helen Keller",
        "In three words I can sum up everything I've learned about life: it goes on. — Robert Frost",
        "If you don't like the road you're walking, start paving another one. — Dolly Parton",
        "Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring. — Marilyn Monroe",
        "Great things happen to those who don't stop believing, trying, learning, and being grateful. ― Roy T. Bennett",
        "When the sun is shining I can do anything; no mountain is too high, no trouble too difficult to overcome. — Wilma Rudolph",
        "Be fanatically positive and militantly optimistic. If something is not to your liking, change your liking. — Rick Steves",
        "Confidence isn't optimism or pessimism, and it's not a character attribute. It's the expectation of a positive outcome. — Rosabeth Moss", 
        "Only when we're drowning do we understand how fierce our feet can kick. — Amanda Gorman",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. — Ralph Waldo Emerson",
        "The most important step a man can take. It's not the first one, is it? It's the next one. Always the next step. ― Brandon Sanderson",
        "We all have two lives. The second one starts when we realize we only have one. — Confucius",
        "It is during our darkest moments that we must focus to see the light. — Aristotle",
        "Optimism is a huge asset. We can always use more of it. But optimism isn’t a belief that things will automatically get better; it’s a conviction that we can make things better. — Melinda French",
        "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. — Oprah Winfrey",
        "And now that you don’t have to be perfect, you can be good. — John Steinbeck",
        "For every minute you are angry, you lose sixty seconds of happiness. — Ralph Waldo Emerson",
        "All your dreams can come true if we have the courage to pursue them. — Walt Disney",
        "Life is never fair, and perhaps it is a good thing for most of us that it is not. — Oscar Wilde"};

    public static void main(String[] args) {
        Date d = new Date();
        Random rand = new Random();
        int n = rand.nextInt(23);
        System.out.println("Today is "+d);
        System.out.println(quotes[n]);
    }
    
}
