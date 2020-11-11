#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

//Gehört zur Vorlesung Betriebssysteme I
//Bitte verschieben
int main (void)
{
  pid_t pid;
  for (int i = 1; i <= 4; i++)
  {
    fork();
    printf(pid);
  }
  return 0;
}
