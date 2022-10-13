#include <jni.h>
#include <stdio.h>
#include <conio.h>
#include <string.h>
/*
 * Class:     com_login_Util
 * Method:    setPassword
 * Signature: ()[B
 */
JNIEXPORT jstring JNICALL Java_com_login_Util_setPassword
  (JNIEnv *, jclass){
      char password[100] = "";
      char* p = password;

      while ((*p = getch()) != '\r') {
        if (*p == '\b' && p > password) {
          putchar('\b');
          putchar(' ');
          putchar('\b');
          p--;
        }
        else if (*p != '\b') {
          putchar('*');
          p++;
        }
      }
      (*env)->
      return password;
  }
