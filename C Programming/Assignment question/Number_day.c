//To print the day according to the number

#include <stdio.h>

int main() {
    int day;
    while (1) {
        printf("Enter a number : ");
        scanf("%d", &day);
        switch (day) {
            case 1:
                printf("Sunday");
                break;
            case 2:
                printf("Monday");
                break;
            case 3:
                printf("Tuesday");
                break;
            case 4:
                printf("Wednesday");
                break;
            case 5:
                printf("Thursday");
                break;
            case 6:
                printf("Friday");
                break;
            case 7:
                printf("Saturday");
                break;
            default:
                printf("Invalid number. Please try again.");
                continue; 
        }
        break; 
    }
    return 0;
}
