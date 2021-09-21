
grammar Assig;

/*Begin parsing here */
start: (task)+; //splits into one or more tasks

task: function; //each task leads to one function


parameter: value (',' value)*; //x and y values that can be led to from here
function: STRING '<-' 'function' '(' (parameter)+ ')' '{' action (action)? '}';

call: ('print' | 'Sys') ('.')? ('sleep')? '(' parameter ')'; //last task

value: STRING
  | NUMBER;

loop: 'while' '(' compare ')' '{' action action action '}';
compare: value '!=' value;
action: result
  | operate
  | call
  | loop
  | assignment;

assignment: STRING '<-' operate;
operate: STRING OPERATIONS (STRING | NUMBER);
result: 'return(' action ')';

//rules
OPERATIONS: '+'
  | '-'
  | '*'
  | '/';

STRING: [a-z|A-Z]+;
NUMBER: [0-9]+;
WS: [ \n\t]+ -> skip;






