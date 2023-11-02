function reverseWordsInSentence(inputSentence) {
    function isLetter(char) {
        return /[a-zA-Z]/.test(char);
    }

    let reversedSentence = '';
    let word = '';

    for (let i = 0; i < inputSentence.length; i++) {
        const c = inputSentence[i];
        if (isLetter(c)) {
            word = c + word; // Build the reversed word
        } else {
            if (word.length > 0) {
                reversedSentence += word + c; // Append reversed word and non-letter character
                word = ''; // Clear the word buffer
            } else {
                reversedSentence += c; // If no word to reverse, simply append the character
            }
        }
    }

    if (word.length > 0) {
        reversedSentence += word; // Append the last word
    }

    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
