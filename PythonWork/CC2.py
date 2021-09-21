def counts(intList, setList):
  my_dict = {} #declare dictionary

  if (len(intList) == 0): #if the int list is empty
    for num in setList:
      my_dict[num] = 0
    return my_dict

  for i in setList:
    count = 0 #set count to 0 for every new element in set
    for j in range(len(intList)):
      if (intList[j] == i): #if match found, add to count
        count += 1
      my_dict[i] = count  #add to dictionary

  return my_dict

print(counts([4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100], [-2, 4, 29]))
print(counts([], [1]))

def switch_pairs(string):
  if (len(string) == 0):
    return ""

  returnString = ""
  lastChar = ""

  if ((len(string)) % 2 != 0):
    lastChar = string[len(string) - 1]

  j = 0 #counter

  for i in range(len(string) - 1):
    if (j == len(string) - 1 or j == len(string)): #check for exit cases
      break

    returnString += string[j + 1] #add to return string
    returnString += string[j]
    j += 2 #increment counter
  
  returnString += lastChar #add last char if string is odd in length
  return returnString

print(switch_pairs("example"))
print(switch_pairs("hello there"))
print(switch_pairs("homework"))
print(switch_pairs(""))


  