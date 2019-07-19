package com.gtcmaile.blogs.web.api;

import com.gtcmaile.blogs.pojo.response.Result;
import com.gtcmaile.blogs.util.file.FileUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * created by jim on 19-6-11 上午11:26
 */
@RestController
@RequestMapping("/file")
public class FileController {
    /**
     * 上传文件的通用接口
     * @param path 上传到哪
     * @param file 文件
     * @return
     */
    @ApiOperation(value = "设置用户信息")
    @PostMapping("upload/{path}")
    public Result commUpload(@PathVariable String path, MultipartFile file){
        return  Result.success(FileUtil.commUpload(file,path));
    }
}
