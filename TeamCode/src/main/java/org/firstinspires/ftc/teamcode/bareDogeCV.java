// Needed external dependency imports:
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvInternalCamera;

// Declarations
private OpenCvCamera phoneCam;
private SkystoneDetector skyStoneDetector;

// Variables
int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
phoneCam = new OpenCvInternalCamera(OpenCvInternalCamera.CameraDirection.BACK, cameraMonitorViewId);
skyStoneDetector = new SkystoneDetector();

// Objects
skystone.
phoneCam.

// Initialization Methods
phoneCam.setPipeline(skyStoneDetector);
phoneCam.startStreaming(320, 240, OpenCvCameraRotation.UPRIGHT);
phoneCam.openCameraDevice();

// Common Methods and Properties
skystone.getScreenPosition()
skystone.getScreenPosition().x
skystone.getScreenPosition().y
phoneCam.getFrameCount()
phoneCam.getFPS()
phoneCam.getTotalFrameTimeMs()
phoneCam.getPipelineTimeMs()
phoneCam.getOverheadTimeMs()
phoneCam.getCurrentPipelineMaxFps()
phoneCam.stopStreaming()
phoneCam.pauseViewport()
phoneCam.resumeViewport()
