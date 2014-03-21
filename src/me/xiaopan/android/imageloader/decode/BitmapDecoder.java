/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.android.imageloader.decode;

import android.graphics.BitmapFactory;
import me.xiaopan.android.imageloader.task.load.LoadRequest;
import android.graphics.Bitmap;

import java.io.IOException;
import java.io.InputStream;

/**
 * 位图解码器
 */
public interface BitmapDecoder{
	/**
	 * 解码
	 * @param loadRequest
	 * @param inputStreamCreator 创建新的用来读取位图的输入流
	 * @return
	 */
	public Bitmap decode(LoadRequest loadRequest,  InputStreamCreator inputStreamCreator) throws IOException;

    public interface InputStreamCreator {
        /**
         * 解码
         * @param options
         * @return
         */
        public Bitmap onDecode(BitmapFactory.Options options);

        /**
         * 解码成功
         */
        public void onDecodeSuccess();

        /**
         * 解码失败
         */
        public void onDecodeFailure();
    }
}
