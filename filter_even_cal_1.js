// write a function that will take an array of numbers as input and remove all odd elements
// satisfy the following input outputs as listed below
// make the false results true

let filter_even = (arr) => {
    let result = [];
    arr.forEach((num) => {
        if(num % 2 === 0){
            result.push(num);
        }
    });
    
    return result;
}


// testcase3
input1 = [3, 3 ,4]
output1 = [4]

// testcase3
input2 = [4, 4 ,4]
output2 = [4, 4, 4]

// testcase3
input3 =  [3, 3 , 3]
output3 =  []


console.log(JSON.stringify(filter_even(input1)) == JSON.stringify(output1));
console.log(JSON.stringify(filter_even(input2)) == JSON.stringify(output2));
console.log(JSON.stringify(filter_even(input3)) == JSON.stringify(output3));

