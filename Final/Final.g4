grammar Final;

// start: (task)+; //splits into one or more tasks

// task: function; //each task leads to one function


// parameter: value (',' value)*; //second value doesn't have to exist
// function: STRING '<-' 'function' '(' (parameter)+ ')' '{' action (action)? '}';

// call: ('print' | 'Sys') ('.')? ('sleep')? '(' parameter ')';

// value: STRING
//   | NUMBER;

// loop: 'while' '(' compare ')' '{' action action action '}'; //three actions needed to be identified
// compare: value '!=' value;
// action: result
//   | operate
//   | call
//   | loop
//   | assignment;

// assignment: STRING '<-' operate;
// operate: STRING OPERATIONS (STRING | NUMBER);
// result: 'return(' action ')';

// //rules
// OPERATIONS: '+'
//   | '-'
//   | '*'
//   | '/';

// STRING: [a-zA-Z]+;
// NUMBER: [0-9]+;
// WS: [ \n\t]+ -> skip;


