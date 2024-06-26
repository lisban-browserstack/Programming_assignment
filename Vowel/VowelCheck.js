function containsVowel(str) {
    str = str.toLowerCase();
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    for (let char of str) {
        if (vowels.includes(char)) {
            return true;
        }
    }
    return false;
}

const input = "Hll Wrld";
const hasVowel = containsVowel(input);
if (hasVowel) {
    console.log("The string contains a vowel.");
} else {
    console.log("The string does not contain any vowels.");
}
