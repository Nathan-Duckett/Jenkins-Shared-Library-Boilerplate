import com.github.nathan-duckett

def call() {
    stage('Log Messages') {
        steps {
            echo "Hello from examplePipeline"
            ExampleClass.printMessageToJenkins(this)
        }
    }
}