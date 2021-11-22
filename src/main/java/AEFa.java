public class AEFa (publicstaticdoubletotalSentiment(String fileName){doubleanswer = 0.0;String phrase = "";String review = textToString(fileName);for(inti = 0; i < review.length(); i++){phrase = removePunctuation(phrase);if(review.substring(i, i + 1).equals(" ")){answer += sentimentVal(phrase);phrase = "";}else{phrase += review.substring(i, i + 1);}}returnanswer;}{
        }
