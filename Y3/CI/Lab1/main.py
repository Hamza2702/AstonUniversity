city_count = int(input("Enter City Count: "))

# Task 1
def create_matrix(cities):
    # Define matrix
    adjacency_matrix = [[0 for x in range(cities)] for y in range(cities)]

    # Fill with data
    #    for i in range(cities):
    #        for j in range(cities):
    #            if i != j:
    #                distance = int(input(f"Enter distance between city {i} and {j}: "))
    #                adjacency_matrix[i][j] = distance
    #            else:
    #                adjacency_matrix[i][j] = 0

    adjacency_matrix = [
        [0, 20, 42, 35],
        [20, 0, 30, 34],
        [42, 30, 0, 12],
        [35, 34, 12, 0]
    ]

    return adjacency_matrix

# Task 2
def evaluate_tsp(adjacency_matrix, route):
    total_cost = 0
    # Go through cities in route
    for i in range(len(route) - 1):
        current_city = route[i]
        next_city = route[i + 1]
        total_cost += adjacency_matrix[current_city][next_city]
    
    # Go back to start
    total_cost += adjacency_matrix[route[-1]][route[0]]
    return total_cost

def create_route():
    route = []
    route = list(map(int, input("Enter the route with spaces separating the numbers, like '0 1 2 3': ").strip().split()))

    return route

if __name__ == "__main__":
    adjacency_matrix = create_matrix(city_count)
    route = create_route()
    cost = evaluate_tsp(adjacency_matrix, route)
    
    for row in adjacency_matrix:
        print(row)

    print("\nRoute:", route)
    print("Total Cost (including return):", cost)
