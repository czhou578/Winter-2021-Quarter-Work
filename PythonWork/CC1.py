def is_reverse(str1, str2, entry = True):
  
  
  if (entry):
    if(len(str1) == 0 and len(str2) == 0):
      return True

    if(len(str1) != len(str2)):
      return False
    
    global stringLength
    stringLength = len(str1)

    global counter 
    counter = 0

  # firstStrChar = str1[counter]
  # lastStrChar = str2[len(str2) - 1 - counter]

  if (str1[0].lower() != str2[len(str2) - 1].lower()):
    return False 
  elif (counter == stringLength - 1 and str1[len(str1) - 1].lower() == str2[0].lower()):
    return True

  counter += 1
  return is_reverse(str1[1:], str2[:-1], False)



print(is_reverse("CS320", "023sC",))
print(is_reverse("Madam", "MaDAm"))
print(is_reverse("Q", "Q"))
print(is_reverse("", ""))
print(is_reverse("e via n", "N aIv E"))
print(is_reverse("Go! Go", "OG !OG"))
print(is_reverse("Obama", "McCain"))
print(is_reverse("banana", "nanaba"))
print(is_reverse("hello!!", "olleh"))
print(is_reverse("madam I", "i m adam"))
print(is_reverse("ok", "oko"))
print(is_reverse("", "x")) #wrong
print(is_reverse("ab", "ca"))







