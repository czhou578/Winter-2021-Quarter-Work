
can_get(town1, town2).
can_get(town2, town3).
can_get(town3, town4).
can_get(town4, town5).
can_get(town5, town6).

is_can_get(X, Y) :-can_get(X, Y).

is_can_get(X, Y) :-
  can_get(X, Z),
  is_can_get(Z, Y).





#C:\\Users\\mycol\\Winter Quarter 2021\\CS 320 Prog. Lang\\Work\\src\\Prolog\\Name.pl