import com.example.ExampleClass

def call() {
    node("") {
        stage('Log Messages') {
            echo "Hello from examplePipeline"
            ExampleClass.printMessageToJenkins(this)
        }
    }
}