city_count = int(input("Enter City Count: "))

# Task 1
def create_matrix(cities):
    # Define matrix
    adjacency_matrix = [[0 for x in range(cities)] for y in range(cities)]

    # Fill with data
    #for i in range(cities):
     #    for j in range(cities):
      #        if i != j:
       #           distance = int(input(f"Enter distance between city {i} and {j}: "))
        #          adjacency_matrix[i][j] = distance
         #     else:
          #        adjacency_matrix[i][j] = 0

    adjacency_matrix = [
        [0, 20, 34, 42],
        [20, 0, 35, 30],
        [34, 35, 0, 12],
        [42, 30, 2, 0]
    ]
    return adjacency_matrix


if __name__ == "__main__":
    adjacency_matrix = create_matrix(city_count)

    for row in adjacency_matrix:
        print(row)
