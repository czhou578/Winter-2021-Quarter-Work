female(helen).
female(ruth).
female(petunia).
female(lili).

male(paul).
male(albert).
male(vernon).
male(james).
male(dudley).
male(harry).

parent_of(paul,petunia).
parent_of(helen,petunia).
parent_of(paul,lili).
parent_of(helen,lili).
parent_of(albert,james).
parent_of(ruth,james).
parent_of(petunia,dudley).
parent_of(vernon,dudley).
parent_of(lili,harry).
parent_of(james,harry).

is_father_of(X, Y) :- male(X),
                 parent_of(X, Y).
is_mother_of(X, Y) :- female(X),
                parent_of(X, Y).


grandfather_of(X, Y) :- is_father_of(X, Z),
                     parent_of(Z, Y).

grandmother_of(X, Y) :- is_mother_of(X, Z),
                    parent_of(Z, Y).

sister_of(X, Y) :- female(X),
                parent_of(Z, X),
                parent_of(Z, Y).

sister_of(X, Y) :- male(X),
                parent_of(Z, X),
                parent_of(Z, Y).    

aunt_of(X, Y) :- sister_of(X, Z),
              parent_of(Z, Y).  


can_get(town1, town2).
can_get(town2, town3).
can_get(town3, town4).
can_get(town4, town5).
can_get(town5, town6).

is_can_get(X, Y) :-can_get(X, Y).

is_can_get(X, Y) :-
  can_get(X, Z),
  is_can_get(Z, Y).
        

