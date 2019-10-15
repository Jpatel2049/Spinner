# Spinner (Spanish)

CIS 3515 Assignment 5
Instructions: Extend your previous application by adding localization with a Spanish translation. You
will update the application you worked on in the last lab to ensure that text labels and all string literals
are replaced with strings from a resource file. You will then provide a translation for a second language.
1. Create a new branch of your previous application and use it as a starting point.
2. Add string resources to your application to provide the text necessary to display the word for
each color in your adapter view. One approach is to use individual String resource elements, but
a better approach is to use a String-array resource:
https://developer.android.com/guide/topics/resources/string-resource.html
3. Modify your application code to use the string resources to display the labels in your view. You
can retrieve a string-array resource as follows:
Resources res = [context.]getResources();
String[] gridLabels = res.getStringArray(R.array.my_array);
4. Create a new strings.xml file for your Spanish translations
1. In Android Studio's Project view, right click on the values folder under res and select New
→ Android resource file
2. Enter strings in the File name field and select main Source set and enter values under
Directory name
3. Select Locale under Available qualifiers and click the >> button
4. Select es:Spanish under Language. Leave Any region selected on Specific Region Only
5. Once complete click on OK
5. Copy your string-array resource (and all other string resources) from your default strings
resource file, into your new Spanish translation file, and replace all the text values with the
proper translation.
1. Ways to get translations (if you don’t know the language)
1. Good → Google translate
2. Better (but not practical for us) → Pay a translation service (Google provides one)
6. Test your application by changing the Language of your virtual device from English to Spanish.
You will find the Language configuration under Device Settings. Good luck changing it back
from Spanish to English. See how your app behaves when you try changing the color when 
using the Spanish language. Does it crash? Think of workarounds for this problem and
implement it.
7. Make sure you push your project to GitHub.
