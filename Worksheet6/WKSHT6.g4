grammar WKSHT6;

//parser rules

// object: '{' pair (',' pair)* '}';
// pair: STRING ':' value; //name is uppercase because can be matched with token
// value: STRING
//   | NUMBER
//   | object
//   | array
//   | ',';
  
// array: '[' value (',' value)* ']';



// //token rules
// STRING: '"'[a-zA-Z.]+ '"';
// NUMBER: [0-9]+;

// //Skip Rules
// WS: [ \n\t]-> skip;

object: '{' pair (',' pair)* '}';
pair: STRING ':' value;
value: STRING
  | NUMBER
  | array
  | object;

array: '['value ']';


STRING: [a-zA-Z]+;
NUMBER: [0-9]+;

