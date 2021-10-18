package annachiriciuc;

import javax.lang.model.type.TypeVariable;

public class Program {

    public static void main(String[] args) {
        String text = "The dotnet tool (dotnet.exe on Windows) helps you to manage .NET source\n" +
                "code and binaries from the command line. You can use it to both build and\n" +
                "run your program, as an alternative to using an integrated development\n" +
                "environment (IDE) such as Visual Studio or Visual Studio Code.\n" +
                "You can obtain the dotnet tool either by installing the .NET 5 SDK or by\n" +
                "installing Visual Studio. Its default location is %ProgramFiles%\\dotnet on\n" +
                "Windows or /usr/bin/dotnet on Ubuntu Linux.\n" +
                "To compile an application, the dotnet tool requires a project file as well as\n" +
                "one or more C# files. The following command scaffolds a new console\n" +
                "project (creates its basic structure):";

        TextFormatting myText = new TextFormatting();
        myText.printData();
    }
}
