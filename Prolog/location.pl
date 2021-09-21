# location(desk, office).
# location(apple, kitchen).
# location(flashlight, desk).
# location(broccoli, kitchen).
# location(crackers, kitchen).
# location(computer, office).

bigger(elephant, house).
bigger(horse, donkey).
bigger(donkey, monkey).

is_bigger(X, Y) :-bigger(X, Y).
is_bigger(X, Y) :-
  bigger(X, Z),
  is_bigger(Z, Y).


#C:\\Users\\mycol\\Winter Quarter 2021\\CS 320 Prog. Lang\\Work\\src\\Prolog\\location.pl