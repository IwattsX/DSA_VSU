# Python3 implementation of
# the Quadratic Probing

# Function to print an array


def printArray(arr, n):
    print(arr)

# Function to implement the
# quadratic probing


def hashing(table, tsize, arr, N, alphabet):
	# Iterating through the array
	for i in alphabet:

		# Computing the hash value
		hv = arr[i] % tsize

		# Insert in the table if there
		# is no collision
		if (table[hv] == -1):
			table[hv] = arr[i]

		else:

			# If there is a collision
			# iterating through all
			# possible quadratic values
			for j in range(tsize):

				# Computing the new hash value
				t = (hv + j * j) % tsize

				if (table[t] == -1):

					# Break the loop after
					# inserting the value
					# in the table
					table[t] = arr[i]
					break

	printArray(table, N)


# Driver code
if __name__ == "__main__":
	Keys = "ABCDEFGHIJKLMNOP"
	VALUES = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
	arr = { k:v for (k,v) in zip(Keys, VALUES)}
	
	N = len(arr)

	# Size of the hash table
	L = 16

	hash_table = [0] * 16

	# Initializing the hash table
	for i in range(L):
		hash_table[i] = -1

	# Function call
	hashing(hash_table, L, arr, N, Keys)

# This code is contributed by code_hunt
