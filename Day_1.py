def sort(ar):
    l, m, h = 0, 0, len(ar) - 1
    
    while m <= h:
        if ar[m] == 0:
            ar[l], ar[m] = ar[m], ar[l]
            l += 1
            m += 1
        elif ar[m] == 1:
            m += 1
        else:
            ar[h], ar[m] = ar[m], ar[h]
            h -= 1

def main():
    input_str = input("Enter the array elements separated by spaces (0s, 1s, and 2s only): ")
    ar = list(map(int, input_str.split()))
    
    if any(x not in (0, 1, 2) for x in ar):
        print("Error: The array must contain only 0s, 1s, and 2s.")
        return
    
    sort(ar)
    print("Sorted array:", ar)
if __name__ == "__main__":
    main()
