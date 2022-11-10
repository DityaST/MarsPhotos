
package com.example.android.marsphotos.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.marsphotos.databinding.FragmentOverviewBinding

/**
 * fragment untuk menampilkan status dari photo dalam web service
 */
class OverviewFragment : Fragment() {

    private val viewModel: OverviewViewModel by viewModels()

    /**
     * Mengembang tata letak dengan Data Binding, menetapkan pemilik siklus hidupnya ke OverviewFragment
     * Untuk mengaktifkan Pengikatan Data untuk mengamati LiveData, dan menyiapkan RecyclerView dengan adaptor.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentOverviewBinding.inflate(inflater)

        // mengijinkan pengikatan data pada databinding untuk mengamati livedata
        binding.lifecycleOwner = this

        // memberikan akses ke OverviewViewModel
        binding.viewModel = viewModel

        binding.photosGrid.adapter = PhotoGridAdapter()

        return binding.root
    }
}
