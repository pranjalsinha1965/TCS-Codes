function isLeapYear(year) {
    if (year % 400 === 0) return true;
    if (year % 100 === 0) return false;
    return year % 4 === 0;
}

console.log(isLeapYear(2020));
console.log(isLeapYear(2100));
console.log(isLeapYear(2000));

function generateFibonacci(n) {
    const fibonacci = [0, 1];
    for(let i=2; i<n; i++)    
    {
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
    }
    return fibonacci.slice(0, n);
}

console.log(generateFibonacci(10));

function isPrime(num) {
    if (num <= 1) return false;
    if (num <= 3) return true;

    if (num % 2 === 0 || num % 3 === 0) return false;
    let i=5;
    while(i*i <= num){
        if(num % i === 0 || num % i(i+2) === 0) return false;
        i += 6;
    }
    return true;
}
console.log(isPrime(11));
console.log(isPrime(15));a

function sumOfNatural(n) {
    return (n * (n + 1)) / 2;
}
console.log(sumOfNaturalNumbers(10));

function rotateArray(arr, k) {
    const n = arr.length;
    k = k % n;
    const rotated = [...arr.slice(n-k), ...arr.slice(0, n-k)];
    return rotated;
}

const arrayOne = [1, 2, 3, 4, 5]
console.log(rotateArray(arrayOne, 5));


