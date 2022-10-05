#include <jni.h>
#include <stdio.h>
#include <string.h>
#include <conio.h>
/*
 * Class:     com_google_input_test
 * Method:    setPassword
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_google_input_test_setPassword
  (JNIEnv *, jobject){
    char password[100] = "";
    char *p = password;
    while((*p = getch())!='\r') 	char password[100] = "";
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
}